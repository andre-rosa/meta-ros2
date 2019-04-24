# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "flexbe_input enables to send data to onboard behavior when required."
AUTHOR = "Philipp Schillinger <schillin@kth.se>"
HOMEPAGE = "http://ros.org/wiki/flexbe_input"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    actionlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    flexbe-msgs \
    rospy \
    smach-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    flexbe-msgs \
    rospy \
    smach-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_input/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "503126caddc487ecd705784ca09bd4c4"
SRC_URI[sha256sum] = "0ebbf1d4e17a6a51d7699e23869d3e7741220a0e18a80114979f4c67d23106be"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_input-1.1.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/flexbe/flexbe_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/flexbe/flexbe_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/flexbe/flexbe-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/flexbe/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/flexbe/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
