# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "A Levenberg-Marquardt solver for EXOTica"
AUTHOR = "Christian Rauch <Christian.Rauch@ed.ac.uk>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_BPN = "exotica_levenberg_marquardt_solver"

ROS_BUILD_DEPENDS = " \
    exotica-core \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    exotica-core \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    exotica-core \
    libeigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_levenberg_marquardt_solver/5.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bb872960faf09ce1580374fa34092e27"
SRC_URI[sha256sum] = "8de5b8fb856c5ca84c37447698c4635251f39b39db82d323f6b788aea4b1d93f"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_levenberg_marquardt_solver-5.0.0-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('exotica', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/exotica/exotica_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/exotica/exotica-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/exotica/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/exotica/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
