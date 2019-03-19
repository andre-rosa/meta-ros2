# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Helper scripts for tests that use the ROS launch tool."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Esteve Fernandez"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "launch"
ROS_BPN = "launch_testing"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    launch \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-flake8 \
    ament-pep257 \
    launch \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/bouncy/launch_testing/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9d8d50a8cbf9c125df3eef0393c4f4d0"
SRC_URI[sha256sum] = "75e6052d3aae65fa858f627ba22c6dbdc27c0aacfde4af92e0a165d3fd7a3035"
S = "${WORKDIR}/launch-release-release-bouncy-launch_testing-0.6.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('launch', d)}"
ROS_BUILD_TYPE = "ament_python"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('launch', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/launch/launch_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/launch/launch-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/launch/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/launch/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
