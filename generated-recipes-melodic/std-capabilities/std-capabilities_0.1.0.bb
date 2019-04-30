# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains standard capability interfaces, which describe common robot capabilities in terms of ROS concepts such as topics, services, actions, and parameters."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/std_capabilities"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/std_capabilities-release/archive/release/melodic/std_capabilities/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bde224c5aa3b597920881314f5863dfc"
SRC_URI[sha256sum] = "56846414a12f4f667aec42eaef1c602c355854fdaa729692117961e54d94a9b6"
S = "${WORKDIR}/std_capabilities-release-release-melodic-std_capabilities-0.1.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/std-capabilities/std-capabilities_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/std-capabilities/std-capabilities_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/std-capabilities/std-capabilities-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/std-capabilities/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/std-capabilities/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
