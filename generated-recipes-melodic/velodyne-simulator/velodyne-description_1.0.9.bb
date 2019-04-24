# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF and meshes describing Velodyne laser scanners."
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
HOMEPAGE = "http://wiki.ros.org/velodyne_description"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    urdf \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DataspeedInc-release/velodyne_simulator-release/archive/release/melodic/velodyne_description/1.0.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0e4bd32ebbbe24ce07c5375c6de3a23a"
SRC_URI[sha256sum] = "3c21ef0d86e8d52e10b95d846d089c029d80b58f6f12b52bf19ed7f3a94c3094"
S = "${WORKDIR}/velodyne_simulator-release-release-melodic-velodyne_description-1.0.9-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/velodyne-simulator/velodyne-simulator_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/velodyne-simulator/velodyne-simulator_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/velodyne-simulator/velodyne-simulator-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/velodyne-simulator/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/velodyne-simulator/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
