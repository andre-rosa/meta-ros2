# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The CMake API for ament_cpplint to lint C / C++ code using cpplint."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BPN = "ament_cmake_cpplint"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-core-native \
    ament-cmake-test-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-test-native \
    ament-cpplint-native \
"

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-copyright \
    ament-cmake-lint-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cmake_cpplint/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dd192c9332a10cc63f8c54a317d56367"
SRC_URI[sha256sum] = "af9892961313405da4f1431e4b6a16775174becbffb74f749f6d8201ca5ab7a0"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cmake_cpplint-0.5.2-0"

ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('ament-lint', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/ament-lint_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/ament-lint-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
