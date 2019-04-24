# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pr2_gripper_action provides an action interface for using the   gripper. Users can specify what position to move to (while limiting the   force) and the action will report success when the position is reached or   failure when the gripper cannot move any longer."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
HOMEPAGE = "http://ros.org/wiki/pr2_gripper_action"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    pr2-controllers-msgs \
    pr2-mechanism-controllers \
    pr2-mechanism-model \
    robot-mechanism-controllers \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    pr2-controllers-msgs \
    pr2-mechanism-controllers \
    pr2-mechanism-model \
    robot-mechanism-controllers \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    pr2-controllers-msgs \
    pr2-mechanism-controllers \
    pr2-mechanism-model \
    robot-mechanism-controllers \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/pr2_gripper_action/1.10.15-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "47b31045b0329719004eca97e2ee767e"
SRC_URI[sha256sum] = "c2af780c2458ba7a28fcef738f8b231d59367ee9e82aea74f9fe4802216b6402"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-pr2_gripper_action-1.10.15-1"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/pr2-controllers/pr2-controllers_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/pr2-controllers/pr2-controllers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-controllers/pr2-controllers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-controllers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-controllers/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
