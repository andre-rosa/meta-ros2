# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "C++ nodes which access the native handles of the rmw implemenation."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BPN = "demo_nodes_cpp_native"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rmw-fastrtps-cpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
    rmw-fastrtps-cpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rmw-fastrtps-cpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/demo_nodes_cpp_native/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b5bd4e63888018951c82803595c40bb0"
SRC_URI[sha256sum] = "3a7bbe8783baab74faa5bfc7f49cc90e4ffa199f6cde8b83dcdf0146dcc0f5fe"
S = "${WORKDIR}/demos-release-release-crystal-demo_nodes_cpp_native-0.6.2-0"

ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('demos', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/demos_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/demos-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
