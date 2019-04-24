# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Search-based planning library (SBPL)."
AUTHOR = "Pyo <pyo@robotis.com>"
HOMEPAGE = "http://sbpl.net"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/sbpl-release/archive/release/melodic/sbpl/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1cc8d0b5148187c75d01348aaa399aaf"
SRC_URI[sha256sum] = "9f24887428cc4e548e8cb297b225d952a1085e3c1f555a847350016c21c7cef2"
S = "${WORKDIR}/sbpl-release-release-melodic-sbpl-1.3.1-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/sbpl/sbpl_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/sbpl/sbpl_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sbpl/sbpl-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sbpl/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sbpl/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
