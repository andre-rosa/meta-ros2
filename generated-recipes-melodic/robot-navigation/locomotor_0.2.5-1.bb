# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Locomotor is an extensible path planning coordination engine that replaces move_base. The goal is to provide a mechanism for controlling what happens when the global and local planners succeed and fail. It leverages ROS callback queues to coordinate multiple threads."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "locomotor"

ROS_BUILD_DEPENDS = " \
    actionlib \
    geometry-msgs \
    locomotor-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav-core2 \
    nav-msgs \
    pluginlib \
    roscpp \
    rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    geometry-msgs \
    locomotor-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav-core2 \
    nav-msgs \
    pluginlib \
    roscpp \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    geometry-msgs \
    locomotor-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav-core2 \
    nav-msgs \
    pluginlib \
    roscpp \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/locomotor/0.2.5-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "385ccbb0838323c6e9559963ad9fc69a"
SRC_URI[sha256sum] = "d963fa2820b1c75aaf1f74fa7756f26d27cc254b1f01ab40a5c078c2bae8a224"
S = "${WORKDIR}/robot_navigation-release-release-melodic-locomotor-0.2.5-1"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/robot-navigation/robot-navigation_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/robot-navigation/robot-navigation_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-navigation/robot-navigation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-navigation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-navigation/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
