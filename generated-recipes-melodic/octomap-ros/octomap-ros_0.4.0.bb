# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "octomap_ros provides conversion functions between ROS and OctoMap's native types.     This enables a convenvient use of the octomap package in ROS."
AUTHOR = "Armin Hornung <HornungA@informatik.uni-freiburg.de>"
HOMEPAGE = "http://ros.org/wiki/octomap_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "octomap_ros"

ROS_BUILD_DEPENDS = " \
    catkin \
    octomap \
    octomap-msgs \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    octomap \
    octomap-msgs \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    octomap \
    octomap-msgs \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/octomap_ros-release/archive/release/melodic/octomap_ros/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "21059dd71d5b3e891df42d2e56fe10ec"
SRC_URI[sha256sum] = "50dca555a5c7883b74068ae676db17671fa15da854f2985ed4999feff70089fd"
S = "${WORKDIR}/octomap_ros-release-release-melodic-octomap_ros-0.4.0-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('octomap-ros', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/octomap-ros/octomap-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/octomap-ros/octomap-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/octomap-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/octomap-ros/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
