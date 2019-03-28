# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "C++ implementation of Lie Groups using Eigen."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Hauke Strasdat"
HOMEPAGE = "https://github.com/strasdat/sophus"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "sophus"
ROS_BPN = "sophus"

ROS_BUILD_DEPENDS = " \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/sophus-release/archive/release/crystal/sophus/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b35e8cb2a638c846d1258f10a13ee3f3"
SRC_URI[sha256sum] = "bf2d15f293ed5fc5710b76bf6be309ddee55b910a37f34cc259b69bce11ef6f2"
S = "${WORKDIR}/sophus-release-release-crystal-sophus-1.0.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('sophus', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('sophus', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/sophus/sophus_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/sophus/sophus-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/sophus/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/sophus/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
