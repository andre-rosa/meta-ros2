# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The Industrial deprecated package contains nodes, launch files, etc... that are slated for    deprecation.  This package is the last place something will end up before being deleted.     If you are missing a package/node and find it's contents here, then you should consider    a replacement."
AUTHOR = "Shaun Edwards <sedwards@swri.org>"
HOMEPAGE = "http://ros.org/wiki/industrial_deprecated"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "industrial_deprecated"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_deprecated/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b7128af1a4566e7b399793209d826ddf"
SRC_URI[sha256sum] = "22330dbdb44092750340bbd8a283441f65bd0135ddc3c08d5535736d0ceec9c9"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_deprecated-0.7.0-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('industrial-core', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/industrial-core/industrial-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/industrial-core/industrial-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/industrial-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/industrial-core/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
