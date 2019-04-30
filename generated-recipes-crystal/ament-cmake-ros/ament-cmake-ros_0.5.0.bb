# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS specific CMake bits in the ament buildsystem."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/ament_cmake_ros-release/archive/release/crystal/ament_cmake_ros/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e326124b340670178b6c39eed8c031ec"
SRC_URI[sha256sum] = "dbbe845687229efffa115f1d88111fb766276cb7eaf4dd8d55b91149e76f6349"
S = "${WORKDIR}/ament_cmake_ros-release-release-crystal-ament_cmake_ros-0.5.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ament-cmake-ros/ament-cmake-ros_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ament-cmake-ros/ament-cmake-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-cmake-ros/ament-cmake-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-cmake-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-cmake-ros/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
