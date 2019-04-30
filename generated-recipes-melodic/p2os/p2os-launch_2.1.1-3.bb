# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch and config files designed for use with the p2os stack."
AUTHOR = "Hunter L. Allen <hunter@openrobotics.org>"
HOMEPAGE = "http://ros.org/wiki/p2os-purdue"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    p2os-driver \
    p2os-msgs \
    p2os-teleop \
    p2os-urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/melodic/p2os_launch/2.1.1-3.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "28eb1ea387156e4d95660b33cbe7942d"
SRC_URI[sha256sum] = "44ce86f957548ceb122a58f2073bf32128e8e5c2ed32a95e4c76ad16ae37856f"
S = "${WORKDIR}/p2os-release-release-melodic-p2os_launch-2.1.1-3"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/p2os/p2os_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/p2os/p2os_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/p2os/p2os-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/p2os/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/p2os/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
