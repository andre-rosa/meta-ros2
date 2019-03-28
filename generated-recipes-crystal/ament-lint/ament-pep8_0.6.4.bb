# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code against the style conventions in PEP 8 and     generate xUnit test result files."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-pep8 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_pep8/0.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c22f523df5c1688a23ccb0a19949d988"
SRC_URI[sha256sum] = "0e32fad5d0415c3f3c752fef5cec0254d9c2bfee07cddedad4df37aa3c920497"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_pep8-0.6.4-0"

ROS_BUILD_TYPE = "ament_python"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ament-lint/ament-lint_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ament-lint/ament-lint_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/ament-lint-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
