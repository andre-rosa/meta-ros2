# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Cartographer is a system that provides real-time simultaneous localization     and mapping (SLAM) in 2D and 3D across multiple platforms and sensor     configurations. This package provides Cartographer's ROS integration."
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
ROS_AUTHOR = "The Cartographer Authors <google-cartographer@googlegroups.com>"
HOMEPAGE = "https://github.com/ros2/cartographer_ros"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b73cebba72f83c5afebf178817283e37"

ROS_CN = "cartographer_ros"
ROS_BPN = "cartographer_ros"

ROS_BUILD_DEPENDS = " \
    cartographer \
    cartographer-ros-msgs \
    libeigen \
    lua \
    nav-msgs \
    pcl \
    pcl-conversions \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-eigen \
    tf2-msgs \
    tf2-ros \
    urdf \
    urdfdom-headers \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    cartographer \
    cartographer-ros-msgs \
    lua \
    nav-msgs \
    pcl \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-msgs \
    tf2-ros \
    urdf \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cartographer \
    cartographer-ros-msgs \
    lua \
    nav-msgs \
    pcl \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-msgs \
    tf2-ros \
    urdf \
    visualization-msgs \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/cartographer_ros-release/archive/release/bouncy/cartographer_ros/2.1.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9f8e7d05aff4e7f62905bcec29d719b8"
SRC_URI[sha256sum] = "da9a2272b74e22831ea49a8bd77b16097a18111f6d0eb5b47d71aa897b7b127c"
S = "${WORKDIR}/cartographer_ros-release-release-bouncy-cartographer_ros-2.1.1-1"

ROS_BUILD_TYPE = "ament_cmake"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('cartographer-ros', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('cartographer-ros', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cartographer-ros/cartographer-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cartographer-ros/cartographer-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cartographer-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cartographer-ros/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
