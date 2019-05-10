# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A light-weight, Eigen-based     C++ library for trajectory optimization for legged robots.      This library provides implementations for variables, costs and constraints     that can be used to represent a legged locomotion problem.      The resulting Nonlinear Programming Problem (NLP) can then be solved with     off-the-shelf solvers, e.g. Ipopt using the generic optimizer interface      <a href="http://wiki.ros.org/ifopt">ifopt</a>."
AUTHOR = "Alexander W. Winkler <alexander.w.winkler@gmail.com>"
ROS_AUTHOR = "Alexander W. Winkler"
HOMEPAGE = "http://github.com/ethz-adrl/towr"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "towr"
ROS_BPN = "towr"

ROS_BUILD_DEPENDS = " \
    ifopt \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ifopt \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    ifopt \
    libeigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ethz-adrl/towr-release/archive/release/melodic/towr/1.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "71e9c51a1d0d92e0749519e5314f53ee"
SRC_URI[sha256sum] = "62df4c4444a14ce7bfb5bef8fbcd602942cb97a36b24ed7a7413575568b9a50f"
S = "${WORKDIR}/towr-release-release-melodic-towr-1.4.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('towr', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('towr', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/towr/towr_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/towr/towr-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/towr/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/towr/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
