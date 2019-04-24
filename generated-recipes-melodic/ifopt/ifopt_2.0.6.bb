# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An <a href="http://eigen.tuxfamily.org">Eigen-</a>     based interface to Nonlinear Programming solver     <a href="https://projects.coin-or.org/Ipopt">Ipopt</a>.      Inuitive and efficient C++ implementation of variables, costs and      constraints using Eigen. Easy integration in your projects in catkin     or pure cmake."
AUTHOR = "Alexander W. Winkler <alexander.w.winkler@gmail.com>"
HOMEPAGE = "https://github.com/ethz-adrl/ifopt"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    coinor-libipopt-dev \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    coinor-libipopt-dev \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    coinor-libipopt-dev \
    libeigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ethz-adrl/ifopt-release/archive/release/melodic/ifopt/2.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "33725b58093a0b48334aa6505f7a2dd1"
SRC_URI[sha256sum] = "3f35e3e9837f7f609ac6d1f982742d579f760b4d3f366d9711c1420bb136b4e2"
S = "${WORKDIR}/ifopt-release-release-melodic-ifopt-2.0.6-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ifopt/ifopt_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ifopt/ifopt_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ifopt/ifopt-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ifopt/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ifopt/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
