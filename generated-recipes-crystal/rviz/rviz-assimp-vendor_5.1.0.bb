# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Wrapper around assimp, providing nothing but a dependency on assimp, on some systems.     On others, it provides a fixed CMake module or even an ExternalProject build of assimp."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "http://assimp.sourceforge.net/index.html"
SECTION = "devel"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_CN = "rviz"
ROS_BPN = "rviz_assimp_vendor"

ROS_BUILD_DEPENDS = " \
    assimp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    assimp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assimp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/crystal/rviz_assimp_vendor/5.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1f0ed357a155f8fda35ab2b7898d6afb"
SRC_URI[sha256sum] = "b571fec410ffc054065ebb16be64e2ef2e6b50b62c9a3fe4656ffde67750a8e9"
S = "${WORKDIR}/rviz-release-release-crystal-rviz_assimp_vendor-5.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('rviz', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('rviz', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/rviz_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/rviz-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
