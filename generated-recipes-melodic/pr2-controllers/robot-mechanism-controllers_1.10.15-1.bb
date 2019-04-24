# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generic Mechanism Controller Library"
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
HOMEPAGE = "http://ros.org/wiki/robot_mechanism_controllers"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    actionlib \
    angles \
    control-msgs \
    control-toolbox \
    diagnostic-msgs \
    eigen-conversions \
    filters \
    geometry-msgs \
    kdl-parser \
    libtool \
    message-filters \
    message-generation \
    pluginlib \
    pr2-controller-interface \
    pr2-controller-manager \
    pr2-controllers-msgs \
    pr2-mechanism-model \
    realtime-tools \
    roscpp \
    std-msgs \
    tf \
    tf-conversions \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    angles \
    control-msgs \
    control-toolbox \
    diagnostic-msgs \
    eigen-conversions \
    filters \
    geometry-msgs \
    kdl-parser \
    libtool \
    message-filters \
    message-runtime \
    pluginlib \
    pr2-controller-interface \
    pr2-controller-manager \
    pr2-controllers-msgs \
    pr2-mechanism-model \
    realtime-tools \
    roscpp \
    rospy \
    std-msgs \
    tf \
    tf-conversions \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    angles \
    control-msgs \
    control-toolbox \
    diagnostic-msgs \
    eigen-conversions \
    filters \
    geometry-msgs \
    kdl-parser \
    libtool \
    message-filters \
    message-runtime \
    pluginlib \
    pr2-controller-interface \
    pr2-controller-manager \
    pr2-controllers-msgs \
    pr2-mechanism-model \
    realtime-tools \
    roscpp \
    rospy \
    std-msgs \
    tf \
    tf-conversions \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/robot_mechanism_controllers/1.10.15-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c3d7fcb2dc59cb73ec24d4c45a8eb1be"
SRC_URI[sha256sum] = "3edf4bf3c0aec34188fe768259562f3af1e4795c971f6ce581febdd56a186dfd"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-robot_mechanism_controllers-1.10.15-1"

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
