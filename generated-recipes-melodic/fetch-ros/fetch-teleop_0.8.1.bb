# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Teleoperation for fetch and freight."
AUTHOR = "Russell Toris <rtoris@fetchrobotics.com>"
HOMEPAGE = "http://docs.fetchrobotics.com/teleop.html"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    actionlib \
    control-msgs \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    topic-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    control-msgs \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    topic-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    control-msgs \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_teleop/0.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e54f362d7e2cd0d0f014ba5176112691"
SRC_URI[sha256sum] = "cfb1141e6a532b67af9d7435c2797936e24fd9d2661a6327a3ad785be4bf33a4"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_teleop-0.8.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/fetch-ros/fetch-ros_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/fetch-ros/fetch-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fetch-ros/fetch-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fetch-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fetch-ros/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
