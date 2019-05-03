# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "EusLisp software developed and used by JSK at The University of Tokyo"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://euslisp.github.io/jskeus/manual.html"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "jskeus"

ROS_BUILD_DEPENDS = " \
    euslisp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    euslisp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    euslisp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jskeus-release/archive/release/melodic/jskeus/1.2.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5c006f5fea5a4df61600fae7f2d41ea8"
SRC_URI[sha256sum] = "7029b7cebfd39f6ff41fe8988b972ec265072336cad162905116689fea92e59a"
S = "${WORKDIR}/jskeus-release-release-melodic-jskeus-1.2.1-1"

ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('jskeus', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jskeus/jskeus_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jskeus/jskeus-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jskeus/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jskeus/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
