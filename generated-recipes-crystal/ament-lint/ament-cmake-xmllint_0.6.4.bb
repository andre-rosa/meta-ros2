# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The CMake API for ament_xmllint to check XML file using xmmlint."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ament_lint"
ROS_BPN = "ament_cmake_xmllint"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-core-native \
    ament-cmake-test-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-test-native \
    ament-xmllint-native \
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

SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cmake_xmllint/0.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b61da4170a777fd96ea1a2b6f0920aa3"
SRC_URI[sha256sum] = "3c62c07aa1f927358d19975e1efc9252b74b3e087cde3ce38a09772b5e629aca"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cmake_xmllint-0.6.4-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('ament-lint', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('ament-lint', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/ament-lint_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/ament-lint-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
