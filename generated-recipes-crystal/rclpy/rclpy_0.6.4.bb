# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing the Python client."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    rcl \
    rcl-action \
    rcl-yaml-param-parser \
    rcutils \
    rmw-implementation \
    rmw-implementation-cmake \
    unique-identifier-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    python-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    rcl \
    rcl-action \
    rcl-yaml-param-parser \
    rmw-implementation \
    unique-identifier-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    builtin-interfaces \
    rcl \
    rcl-action \
    rcl-yaml-param-parser \
    rmw-implementation \
    unique-identifier-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    python3-pytest \
    rcl-interfaces \
    rosidl-generator-py \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rclpy-release/archive/release/crystal/rclpy/0.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b4af35baa27a2aebce6019ba635cde8e"
SRC_URI[sha256sum] = "f038de02819aeeb4c26500888db7ac0b56115fc9036e6c0816e62a75ad604dc7"
S = "${WORKDIR}/rclpy-release-release-crystal-rclpy-0.6.4-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rclpy/rclpy_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rclpy/rclpy_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rclpy/rclpy-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rclpy/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rclpy/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
