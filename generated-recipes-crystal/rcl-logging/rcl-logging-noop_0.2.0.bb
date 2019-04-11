# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An rcl logger implementation that doesn't do anything with log messages."
AUTHOR = "Amazon B9 <amazon-b9-ros@amazon.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
    python3-empy-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-ros-native \
    python3-empy-native \
"

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rcl_logging-release/archive/release/crystal/rcl_logging_noop/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6ef9d0ed2c776c8528af4fed9d037e66"
SRC_URI[sha256sum] = "7820b3b21a0cd3964df0a6a60e6f385d4cd89ecc3dc59e8ae9c28b44f9bc0139"
S = "${WORKDIR}/rcl_logging-release-release-crystal-rcl_logging_noop-0.2.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = " \
    rcl_logging_packages \
"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rcl-logging/rcl-logging_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rcl-logging/rcl-logging_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rcl-logging/rcl-logging-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rcl-logging/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rcl-logging/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated_prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
