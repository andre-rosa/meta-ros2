# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tool for iterating through the cells of a costmap to find the closest distance to a subset of cells."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    nav-core2 \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    nav-core2 \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    nav-core2 \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/costmap_queue/0.2.5-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "aa37546ca03ca2f43acd2f1c0b4d9d50"
SRC_URI[sha256sum] = "12cc3931e8f432c3951f95fd4379597f05ec41815ccc9aea7da7c3c9a4a3839b"
S = "${WORKDIR}/robot_navigation-release-release-melodic-costmap_queue-0.2.5-1"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/robot-navigation/robot-navigation_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/robot-navigation/robot-navigation_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-navigation/robot-navigation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-navigation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-navigation/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
