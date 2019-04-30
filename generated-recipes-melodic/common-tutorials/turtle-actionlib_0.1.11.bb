# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtle_actionlib demonstrates how to write an action server and client with the turtlesim. The shape_server provides and action interface for drawing regular polygons with the turtlesim."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/turtle_actionlib"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    angles \
    geometry-msgs \
    message-generation \
    rosconsole \
    roscpp \
    std-msgs \
    turtlesim \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    angles \
    geometry-msgs \
    message-runtime \
    rosconsole \
    roscpp \
    std-msgs \
    turtlesim \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    angles \
    geometry-msgs \
    message-runtime \
    rosconsole \
    roscpp \
    std-msgs \
    turtlesim \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/melodic/turtle_actionlib/0.1.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8dd6fdc5fb70a8cc81f3bd42c96168af"
SRC_URI[sha256sum] = "692d2a6946d45017346aa4165b4331314b1fde5f0067717ce33bf7ebbce1bc94"
S = "${WORKDIR}/common_tutorials-release-release-melodic-turtle_actionlib-0.1.11-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/common-tutorials/common-tutorials_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/common-tutorials/common-tutorials_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/common-tutorials/common-tutorials-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/common-tutorials/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/common-tutorials/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
