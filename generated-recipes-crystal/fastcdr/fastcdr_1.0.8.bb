# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CDR serialization implementation."
AUTHOR = "Steven! Ragnarök <stevenragnarok@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    cmake-native \
"

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/fastcdr-release/archive/release/crystal/fastcdr/1.0.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "522cafb80356c7e1488ce0f83eb9f290"
SRC_URI[sha256sum] = "4ad70c34ca0db3146a4b1eaf0cefb85ffceb28087da57e4b0fd06345607d5935"
S = "${WORKDIR}/fastcdr-release-release-crystal-fastcdr-1.0.8-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/fastcdr/fastcdr_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/fastcdr/fastcdr_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fastcdr/fastcdr-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fastcdr/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fastcdr/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated_prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
