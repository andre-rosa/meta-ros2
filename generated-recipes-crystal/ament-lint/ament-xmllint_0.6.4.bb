# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The ability to check XML files like the package manifest using xmllint     and generate xUnit test result files."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BPN = "ament_xmllint"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libxml2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_xmllint/0.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1f053776eae33e146bdcc4c60ec1e5a4"
SRC_URI[sha256sum] = "e6f9065ffb8db0a928a3c8a4215baa085723a20628839d39274e359ec4bd3650"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_xmllint-0.6.4-0"

ROS_BUILD_TYPE = "ament_python"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('ament-lint', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/ament-lint_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/ament-lint-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
