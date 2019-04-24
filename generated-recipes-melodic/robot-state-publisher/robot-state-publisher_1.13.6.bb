# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package allows you to publish the state of a robot to     <a href="http://ros.org/wiki/tf">tf</a>. Once the state gets published, it is     available to all components in the system that also use <tt>tf</tt>.     The package takes the joint angles of the robot as input     and publishes the 3D poses of the robot links, using a kinematic     tree model of the robot. The package can both be used as a library     and as a ROS node.  This package has been well tested and the code     is stable. No major changes are planned in the near future."
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/robot_state_publisher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    kdl-parser \
    libeigen \
    liburdfdom-headers-dev \
    orocos-kdl \
    rosconsole \
    roscpp \
    rostime \
    sensor-msgs \
    tf \
    tf2-kdl \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    kdl-parser \
    libeigen \
    orocos-kdl \
    rosconsole \
    roscpp \
    rostime \
    sensor-msgs \
    tf \
    tf2-kdl \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    kdl-parser \
    libeigen \
    orocos-kdl \
    rosconsole \
    roscpp \
    rostime \
    sensor-msgs \
    tf \
    tf2-kdl \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/robot_state_publisher-release/archive/release/melodic/robot_state_publisher/1.13.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "cfe903234cff283086ae1cf213a1f639"
SRC_URI[sha256sum] = "6c7097ebd829c690bd5b55296eb4b48ae434f2c75c0e20647f78e716aa56dd74"
S = "${WORKDIR}/robot_state_publisher-release-release-melodic-robot_state_publisher-1.13.6-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/robot-state-publisher/robot-state-publisher_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/robot-state-publisher/robot-state-publisher_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-state-publisher/robot-state-publisher-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-state-publisher/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-state-publisher/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
