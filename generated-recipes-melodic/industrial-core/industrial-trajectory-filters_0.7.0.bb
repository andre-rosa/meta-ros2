# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "<p>      ROS Industrial libraries/plugins for filtering trajectories.    </p>    <p>      This package is part of the ROS Industrial program and contains libraries      and moveit plugins for filtering robot trajectories.    </p>"
AUTHOR = "Shaun Edwards <sedwards@swri.org>"
HOMEPAGE = "http://ros.org/wiki/industrial_trajectory_filters"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "industrial_trajectory_filters"

ROS_BUILD_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    orocos-kdl \
    pluginlib \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    orocos-kdl \
    pluginlib \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    orocos-kdl \
    pluginlib \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_trajectory_filters/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2c6ece9d63538f8055b995b9675f2867"
SRC_URI[sha256sum] = "ce903b69e6712c8ebe654ab523ee627a57881be2c218b5fdb2330d8150520298"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_trajectory_filters-0.7.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/industrial-core/industrial-core_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/industrial-core/industrial-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/industrial-core/industrial-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/industrial-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/industrial-core/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
