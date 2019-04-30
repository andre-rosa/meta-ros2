# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "OMPL is a free sampling-based motion planning library."
AUTHOR = "Mark Moll <mmoll@rice.edu>"
HOMEPAGE = "http://ompl.kavrakilab.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    boost \
    cmake \
    libeigen \
    pkgconfig \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    libeigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ompl-release/archive/release/melodic/ompl/1.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1c9fad89415a5004f76ce911005d5ad7"
SRC_URI[sha256sum] = "35d69fbf80c64944c92a69d468823e68bcd7d776750720c7f50c3af09feb1b93"
S = "${WORKDIR}/ompl-release-release-melodic-ompl-1.4.2-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ompl/ompl_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ompl/ompl_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ompl/ompl-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ompl/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ompl/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
