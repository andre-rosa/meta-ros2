# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package provides four TurtleBot3 basic example include move using interactive marker, move and stop using LDS, move to goal position, move to custom routes. The interactions node is that you can control the TurtleBot3 front and back side or rotate to goal position. The obstacle node is that when the robot meets an obstacle, it stops. The patrol node is that TurtleBot3 move to custom route. There are 3 route(square, triangle, circle) in this package. You can add your route and move the TurtleBot3. The pointop node is that you can insert goal position include distance x-axis, y-axis and angluar z-axis."
AUTHOR = "Pyo <pyo@robotis.com>"
ROS_AUTHOR = "Gilbert <kkjong@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/turtlebot3_example"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "turtlebot3"
ROS_BPN = "turtlebot3_example"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    interactive-markers \
    message-generation \
    nav-msgs \
    rospy \
    sensor-msgs \
    std-msgs \
    turtlebot3-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    interactive-markers \
    message-runtime \
    nav-msgs \
    rospy \
    sensor-msgs \
    std-msgs \
    turtlebot3-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    interactive-markers \
    message-runtime \
    nav-msgs \
    rospy \
    sensor-msgs \
    std-msgs \
    turtlebot3-bringup \
    turtlebot3-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_example/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "00c6ceb760b723c8c0cf8c81cfc98225"
SRC_URI[sha256sum] = "bc0dbd753ed0334630a38db94dbb4cc73ecda965ad2f61843aa40cba93029feb"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_example-1.2.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('turtlebot3', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('turtlebot3', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3/turtlebot3_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3/turtlebot3-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
