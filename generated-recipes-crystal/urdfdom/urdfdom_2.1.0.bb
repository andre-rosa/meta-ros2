# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "A library to access URDFs using the DOM model."
AUTHOR = "Steven! Ragnarök <steven@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "urdfdom"

ROS_BUILD_DEPENDS = " \
    console-bridge \
    console-bridge-vendor \
    libtinyxml \
    tinyxml-vendor \
    urdfdom-headers \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    console-bridge \
    console-bridge-vendor \
    libtinyxml \
    tinyxml-vendor \
    urdfdom-headers \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/urdfdom-release/archive/release/crystal/urdfdom/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ad1ef872a612427434362728807f4d44"
SRC_URI[sha256sum] = "27275c8ea3647c50538c85816341e1de41618345e4b54b9d30314886f9525b89"
S = "${WORKDIR}/urdfdom-release-release-crystal-urdfdom-2.1.0-0"

ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('urdfdom', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdfdom/urdfdom_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdfdom/urdfdom-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdfdom/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdfdom/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
