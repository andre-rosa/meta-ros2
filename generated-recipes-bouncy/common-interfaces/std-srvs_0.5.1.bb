# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some standard service definitions."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/std_srvs/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9fa21a0e33959895caedbdc65ec01515"
SRC_URI[sha256sum] = "5ad2af5b2ba28b71b6759bd14e4a10253e2e4bb0f790f2b36a3f8fe9fda0794b"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-std_srvs-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = " \
    rosidl_interface_packages \
"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/common-interfaces/common-interfaces_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/common-interfaces/common-interfaces_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/common-interfaces/common-interfaces-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/common-interfaces/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/common-interfaces/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
