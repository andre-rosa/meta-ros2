# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The ROS client library in C++."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rclcpp"
ROS_BPN = "rclcpp"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    rcl \
    rcl-interfaces \
    rcl-yaml-param-parser \
    rmw-implementation \
    rosgraph-msgs \
    rosidl-generator-cpp \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    rcl \
    rcl-interfaces \
    rcl-yaml-param-parser \
    rmw \
    rmw-implementation \
    rosgraph-msgs \
    rosidl-generator-cpp \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake \
    rcl \
    rcl-yaml-param-parser \
    rmw-implementation \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    rmw \
    rmw-implementation-cmake \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rclcpp-release/archive/release/bouncy/rclcpp/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "153208adb856975cd84997f9f5c33cae"
SRC_URI[sha256sum] = "b6cb705cee29cb8a27eda4f099a6019c2d929a8e528a771721a1c24956aee51d"
S = "${WORKDIR}/rclcpp-release-release-bouncy-rclcpp-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('rclcpp', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('rclcpp', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rclcpp/rclcpp_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rclcpp/rclcpp-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rclcpp/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rclcpp/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
