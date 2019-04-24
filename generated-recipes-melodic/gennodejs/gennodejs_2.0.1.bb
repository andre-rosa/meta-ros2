# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Javascript ROS message and service generators."
AUTHOR = "Chris Smith <csmith@rethinkrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BUILD_DEPENDS = " \
    genmsg \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    genmsg \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    genmsg \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/RethinkRobotics-release/gennodejs-release/archive/release/melodic/gennodejs/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0f4e2609eb2faa411c7c50baa8395b3b"
SRC_URI[sha256sum] = "09d5f9ee001d83dd19c111dc8c2d995b9e9a90e21df2a379b882ac555b9bc9b1"
S = "${WORKDIR}/gennodejs-release-release-melodic-gennodejs-2.0.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/gennodejs/gennodejs_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/gennodejs/gennodejs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gennodejs/gennodejs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gennodejs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gennodejs/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
