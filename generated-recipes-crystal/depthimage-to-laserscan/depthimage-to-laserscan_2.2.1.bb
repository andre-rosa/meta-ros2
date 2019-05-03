# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "depthimage_to_laserscan"
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
HOMEPAGE = "http://ros.org/wiki/depthimage_to_laserscan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "depthimage_to_laserscan"

ROS_BUILD_DEPENDS = " \
    image-geometry \
    opencv \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    image-geometry \
    opencv \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    image-geometry \
    opencv \
    rclcpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/depthimage_to_laserscan-release/archive/release/crystal/depthimage_to_laserscan/2.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e4109c4dbe1fbf457e461fa85e213b9a"
SRC_URI[sha256sum] = "582d63c338ab61eaa11d0299ba51a6da91979a75877b6c72208f71891e6b13a1"
S = "${WORKDIR}/depthimage_to_laserscan-release-release-crystal-depthimage_to_laserscan-2.2.1-0"

ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('depthimage-to-laserscan', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/depthimage-to-laserscan/depthimage-to-laserscan_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/depthimage-to-laserscan/depthimage-to-laserscan-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/depthimage-to-laserscan/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/depthimage-to-laserscan/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
