# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a recent version of the Bayesian Filtering   Library (BFL), distributed by the Orocos Project.  For stability   reasons, this package is currently locked to revision 31655 (April   19, 2010), but this revision will be updated on a regular basis to   the latest available BFL trunk.  This ROS package does not modify   BFL in any way, it simply provides a convenient way to download and   compile the library, because BFL is not available from an OS package   manager.  This ROS package compiles BFL with the Boost library for   matrix operations and random number generation."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
HOMEPAGE = "http://ros.org/wiki/bfl"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_BUILD_DEPENDS = " \
    cppunit \
    ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    catkin \
    cppunit \
    ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    cppunit \
    ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/bfl-release/archive/release/melodic/bfl/0.8.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "22d32d2877f10884bcfa0bf831c79846"
SRC_URI[sha256sum] = "7c4c61c15768d1cd276cdaaf9a9f5e3088f478383789ffec9fdee325dafc0990"
S = "${WORKDIR}/bfl-release-release-melodic-bfl-0.8.0-1"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/bfl/bfl_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/bfl/bfl_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/bfl/bfl-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/bfl/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/bfl/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
