# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The ROS client library common implementation.     This package contains an API which builds on the ROS middleware API and is optionally built upon by the other ROS client libraries."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rcl"
ROS_BPN = "rcl"

ROS_BUILD_DEPENDS = " \
    rcl-interfaces \
    rcl-logging-noop \
    rcutils \
    rmw-implementation \
    rosidl-generator-c \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    rcl-interfaces \
    rcl-logging-noop \
    rcutils \
    rmw \
    rmw-implementation \
    rosidl-generator-c \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake \
    rcl-interfaces \
    rcl-logging-noop \
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
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/crystal/rcl/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "119ad5707fc096df08be06c7b006c43d"
SRC_URI[sha256sum] = "f14ddc8b99fa0628792237579736220f0114689ea3ad49b90057d462bffe00c7"
S = "${WORKDIR}/rcl-release-release-crystal-rcl-0.6.5-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rcl', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rcl', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rcl/rcl_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rcl/rcl-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rcl/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rcl/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
