# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Gazebo package for Fetch."
AUTHOR = "Alex Moriarty <amoriarty@fetchrobotics.com>"
HOMEPAGE = "http://ros.org/wiki/fetch_gazebo"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    angles \
    boost \
    control-toolbox \
    gazebo-plugins \
    gazebo-ros \
    gazebo-rosdev \
    robot-controllers \
    robot-controllers-interface \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    control-toolbox \
    gazebo-plugins \
    gazebo-ros \
    robot-controllers \
    robot-controllers-interface \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    boost \
    control-msgs \
    control-toolbox \
    depth-image-proc \
    fetch-description \
    gazebo \
    gazebo-plugins \
    gazebo-ros \
    image-proc \
    nodelet \
    rgbd-launch \
    robot-controllers \
    robot-controllers-interface \
    sensor-msgs \
    trajectory-msgs \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetch_gazebo/0.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "cd52f874748cc528584b5fe4873cf1c5"
SRC_URI[sha256sum] = "5b623f04b2a527ddd0a1b7407a754a3bb2e024a68f0baee2452dd364f8a95e2f"
S = "${WORKDIR}/fetch_gazebo-release-release-melodic-fetch_gazebo-0.9.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/fetch-gazebo/fetch-gazebo_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/fetch-gazebo/fetch-gazebo_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fetch-gazebo/fetch-gazebo-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fetch-gazebo/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fetch-gazebo/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
