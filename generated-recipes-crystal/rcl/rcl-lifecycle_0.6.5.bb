# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing a C-based lifecycle implementation"
AUTHOR = "Karsten Knese <karsten@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    lifecycle-msgs \
    rcl \
    rcutils \
    rmw-implementation \
    rosidl-generator-c \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXEC_DEPENDS = " \
    lifecycle-msgs \
    rcl \
    rcutils \
    rmw-implementation \
    rosidl-generator-c \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    osrf-testing-tools-cpp \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/crystal/rcl_lifecycle/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "293f2a82f5d74b414147ecca03e72f18"
SRC_URI[sha256sum] = "63726fad34ad41271afe9159bec525754fccbb6510a32bb7658dd066945c5a08"
S = "${WORKDIR}/rcl-release-release-crystal-rcl_lifecycle-0.6.5-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rcl/rcl_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rcl/rcl_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rcl/rcl-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rcl/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rcl/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated_prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
