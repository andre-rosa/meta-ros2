# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "mrpt_slam"
AUTHOR = "Vladislav Tananaev <v.d.tananaev@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/mrpt_slam"
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
    mrpt-ekf-slam-2d \
    mrpt-ekf-slam-3d \
    mrpt-graphslam-2d \
    mrpt-icp-slam-2d \
    mrpt-rbpf-slam \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_slam/0.1.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "96116e195c441928a587683d64b1e5c6"
SRC_URI[sha256sum] = "3170fb5eacbd6bf03b50022ea4c324dd4e147fbcecbee376c4203e52ca004a95"
S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_slam-0.1.9-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/mrpt-slam/mrpt-slam_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/mrpt-slam/mrpt-slam_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt-slam/mrpt-slam-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt-slam/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt-slam/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
