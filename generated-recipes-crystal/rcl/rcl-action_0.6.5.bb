# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Package containing a C-based ROS action implementation"
AUTHOR = "Jacob Perron <jacob@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rcl"
ROS_BPN = "rcl_action"

ROS_BUILD_DEPENDS = " \
    action-msgs \
    rcl \
    rcutils \
    rmw \
    rosidl-generator-c \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    action-msgs \
    rcl \
    rcutils \
    rmw \
    rosidl-generator-c \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    osrf-testing-tools-cpp \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/crystal/rcl_action/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3795c9480fef3588918150ed194a1437"
SRC_URI[sha256sum] = "310cce8bd98e77096504509809de7d9d19b270025052ff0eb14d88a61b9e700c"
S = "${WORKDIR}/rcl-release-release-crystal-rcl_action-0.6.5-0"

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
