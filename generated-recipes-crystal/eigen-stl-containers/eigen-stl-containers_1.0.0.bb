# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a set of typedef's that allow   using Eigen datatypes in STL containers"
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
HOMEPAGE = "http://eigen.tuxfamily.org/dox/TopicUnalignedArrayAssert.html"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/eigen_stl_containers-release/archive/release/crystal/eigen_stl_containers/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "87347ed583ff3b1eab9695261a1bca7d"
SRC_URI[sha256sum] = "dd870ca56fe118b51f00459340ffcf4cef968c1c6e27f8eab9326b9f02c95ee4"
S = "${WORKDIR}/eigen_stl_containers-release-release-crystal-eigen_stl_containers-1.0.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/eigen-stl-containers/eigen-stl-containers_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/eigen-stl-containers/eigen-stl-containers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/eigen-stl-containers/eigen-stl-containers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/eigen-stl-containers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/eigen-stl-containers/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated_prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
