# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The tools package(including SLAM, Navigation, Manipulation) for OpenManipulator with TurtleBot3"
AUTHOR = "Pyo <pyo@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/open_manipulator_with_tb3_tools"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BUILD_DEPENDS = " \
    ar-track-alvar-msgs \
    geometry-msgs \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    nav-msgs \
    open-manipulator-msgs \
    roscpp \
    roslaunch \
    rospy \
    smach \
    smach-ros \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ar-track-alvar-msgs \
    geometry-msgs \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    nav-msgs \
    open-manipulator-msgs \
    roscpp \
    roslaunch \
    rospy \
    smach \
    smach-ros \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    amcl \
    ar-track-alvar-msgs \
    geometry-msgs \
    joint-state-publisher \
    map-server \
    move-base \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    nav-msgs \
    open-manipulator-msgs \
    robot-state-publisher \
    roscpp \
    roslaunch \
    rospy \
    smach \
    smach-ros \
    std-msgs \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator_with_tb3-release/archive/release/melodic/open_manipulator_with_tb3_tools/1.1.0-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "18f46fb7986e8705335ef99b55f0479d"
SRC_URI[sha256sum] = "6095647043adf0b59ecb69da2f441cbf996fa4729007040dbe2856d3d7341dab"
S = "${WORKDIR}/open_manipulator_with_tb3-release-release-melodic-open_manipulator_with_tb3_tools-1.1.0-2"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/open-manipulator-with-tb3/open-manipulator-with-tb3_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/open-manipulator-with-tb3/open-manipulator-with-tb3_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/open-manipulator-with-tb3/open-manipulator-with-tb3-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/open-manipulator-with-tb3/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/open-manipulator-with-tb3/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
