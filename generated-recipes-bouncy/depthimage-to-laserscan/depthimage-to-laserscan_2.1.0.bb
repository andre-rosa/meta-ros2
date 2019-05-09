# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "depthimage_to_laserscan"
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
ROS_AUTHOR = "Chad Rockey"
HOMEPAGE = "http://ros.org/wiki/depthimage_to_laserscan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "depthimage_to_laserscan"
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

SRC_URI = "https://github.com/ros2-gbp/depthimage_to_laserscan-release/archive/release/bouncy/depthimage_to_laserscan/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "404fab2cbe73411fc38e2d05b11bf413"
SRC_URI[sha256sum] = "909bf014f689eed98f1e790afa350f4f87ca2eecc1bc52763b24bac8374ef395"
S = "${WORKDIR}/depthimage_to_laserscan-release-release-bouncy-depthimage_to_laserscan-2.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('depthimage-to-laserscan', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('depthimage-to-laserscan', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/depthimage-to-laserscan/depthimage-to-laserscan_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/depthimage-to-laserscan/depthimage-to-laserscan-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/depthimage-to-laserscan/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/depthimage-to-laserscan/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
