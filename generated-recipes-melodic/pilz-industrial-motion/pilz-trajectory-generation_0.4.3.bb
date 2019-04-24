# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pilz_trajectory_generation package containing the MoveIt! plugin pilz_command_planner."
AUTHOR = "Alexander Gutenkunst <a.gutenkunst@pilz.de>"
HOMEPAGE = "https://wiki.ros.org/pilz_trajectory_generation"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_BUILD_DEPENDS = " \
    eigen-conversions \
    kdl-conversions \
    moveit-core \
    moveit-msgs \
    moveit-ros-move-group \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    orocos-kdl \
    pilz-extensions \
    pilz-msgs \
    pluginlib \
    roscpp \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    eigen-conversions \
    kdl-conversions \
    moveit-core \
    moveit-msgs \
    moveit-ros-move-group \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    orocos-kdl \
    pilz-extensions \
    pilz-msgs \
    pluginlib \
    roscpp \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    eigen-conversions \
    kdl-conversions \
    moveit-core \
    moveit-msgs \
    moveit-ros-move-group \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    orocos-kdl \
    pilz-extensions \
    pilz-msgs \
    pluginlib \
    roscpp \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    cmake-modules \
    code-coverage \
    pilz-industrial-motion-testutils \
    pilz-testutils \
    prbt-moveit-config \
    prbt-pg70-support \
    prbt-support \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_trajectory_generation/0.4.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5d9bf30dd1be45eca671910a76364602"
SRC_URI[sha256sum] = "dc396f21535578ae455a1800bac7d18d1f0e8fb0dfa9cdeb7b2079203913bfc9"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_trajectory_generation-0.4.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/pilz-industrial-motion/pilz-industrial-motion_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/pilz-industrial-motion/pilz-industrial-motion_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pilz-industrial-motion/pilz-industrial-motion-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pilz-industrial-motion/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pilz-industrial-motion/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
