# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "flexbe_testing provides a framework for unit testing states."
AUTHOR = "Philipp Schillinger <schillin@kth.se>"
HOMEPAGE = "http://ros.org/wiki/flexbe_testing"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "flexbe_testing"

ROS_BUILD_DEPENDS = " \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    flexbe-core \
    flexbe-msgs \
    rospy \
    smach-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    flexbe-core \
    flexbe-msgs \
    rospy \
    smach-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
    std-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_testing/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9d166393b4d8df78319825f1313c7a3a"
SRC_URI[sha256sum] = "07f784fc73b34378dbd7f96b85a3027673d91fd2fd695ad94d624b7a97e90e8e"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_testing-1.1.2-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('flexbe', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/flexbe/flexbe_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/flexbe/flexbe-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/flexbe/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/flexbe/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
