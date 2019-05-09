# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Mesh Conversion Utility  Used to generate '.iv' files from '.stl' files.  This package has not been changed since 2001 and appears to be very stable.  We plan on keeping this package in this revision for mesh conversions.  This package is only available as a single source file for download.  There are no local modifications to this package."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "John Burkardt <jburkardt@fsu.edu>"
HOMEPAGE = "https://sourceforge.net/projects/ivcon/"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

ROS_CN = "ivcon"
ROS_BPN = "ivcon"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
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

SRC_URI = "https://github.com/ros-gbp/ivcon-release/archive/release/melodic/ivcon/0.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b136c5b0548d6df802215048a00a8fc2"
SRC_URI[sha256sum] = "cbf6855c3a967f5e124a3ea7c6c954bbb57345030d77b22e2f76a77a17bcd3f3"
S = "${WORKDIR}/ivcon-release-release-melodic-ivcon-0.1.7-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('ivcon', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('ivcon', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ivcon/ivcon_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ivcon/ivcon-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ivcon/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ivcon/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
