# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a URDF model of WAM-V"
AUTHOR = "Carlos Aguero <caguero@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/wamv_description"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BUILD_DEPENDS = " \
    xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/vrx-release/archive/release/melodic/wamv_description/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1419bb22ccf3d8270904929ed44b4c76"
SRC_URI[sha256sum] = "5bbe5d0b1c2b60abcab2525119219cf28f20b962132593003c885efddb0bbbeb"
S = "${WORKDIR}/vrx-release-release-melodic-wamv_description-1.0.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/vrx/vrx_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/vrx/vrx_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/vrx/vrx-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/vrx/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/vrx/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
