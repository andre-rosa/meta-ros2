# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS client library common implementation.     This package contains an API which builds on the ROS middleware API and is optionally built upon by the other ROS client libraries."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    rcl-interfaces \
    rcutils \
    rmw-implementation \
    rosidl-generator-c \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    rcl-interfaces \
    rcutils \
    rmw \
    rmw-implementation \
    rosidl-generator-c \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake \
    rcutils \
    rmw-implementation \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    osrf-testing-tools-cpp \
    rmw \
    rmw-implementation-cmake \
    std-msgs \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/bouncy/rcl/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6bc09eca825dbecd5654074bb70a1cc6"
SRC_URI[sha256sum] = "f43e3b33cb0786255d9359813a932b9722c2e6293924165b494947c5503259ed"
S = "${WORKDIR}/rcl-release-release-bouncy-rcl-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rcl/rcl_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rcl/rcl_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rcl/rcl-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rcl/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rcl/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
