# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

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

SRC_URI = "https://github.com/yujinrobot-release/sophus-release/archive/release/dashing/sophus/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "59f23fae1d5779db2f02b5195e77ba6e"
SRC_URI[sha256sum] = "50515a277a3145d2a6410061c102e38b7d9a0c4d0bda4f9fd31240872e3cbd98"
S = "${WORKDIR}/sophus-release-release-dashing-sophus-1.0.2-0"

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
