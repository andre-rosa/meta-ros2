# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ ROS message and service generators."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://github.com/ros/gencpp/issues"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "gencpp"

ROS_BUILD_DEPENDS = " \
    genmsg \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    genmsg \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    genmsg \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/gencpp-release/archive/release/melodic/gencpp/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c2c2df7d118faa7c60af6465818e4098"
SRC_URI[sha256sum] = "d5b03777119dd51d50536b5e9613f00b0bb7558f363ed7f7358b8ceb8062b154"
S = "${WORKDIR}/gencpp-release-release-melodic-gencpp-0.6.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/gencpp/gencpp_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/gencpp/gencpp_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gencpp/gencpp-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gencpp/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gencpp/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
