# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosmake is a ros dependency aware build tool which can be used to      build all dependencies in the correct order."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/rosmake"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    catkin \
    python-rospkg \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    python-rospkg \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosmake/1.14.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7287e75b4dd00da9951138dcbb5b5499"
SRC_URI[sha256sum] = "2014461723eb619c99a70d3314a6e392e922a27d17fc9bc5a83292c8dfd0d591"
S = "${WORKDIR}/ros-release-release-melodic-rosmake-1.14.6-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ros/ros_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ros/ros_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros/ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
